import heapq

def solution(jobs):
    time = 0
    spend = 0
    jobCount = len(jobs)
    jobs.sort(key=lambda x: x[0])  # 시작 시간으로 정렬
    
    while jobs:
        candidate = []  # 현재 시간 이전에 요청된 작업들을 저장할 리스트
        for job in jobs:
            if job[0] <= time:
                heapq.heappush(candidate, (job[1], job))  # 소요시간을 기준으로 최소 힙 구성
        
        if candidate:
            job = heapq.heappop(candidate)[1]  # 소요시간이 가장 짧은 작업 선택
            spend += (time - job[0]) + job[1]  # 대기 시간 + 작업 소요시간
            time += job[1]  # 시간 업데이트
            jobs.remove(job)  # 처리된 작업 제거
        else:
            time += 1  # 아직 처리할 작업이 없으므로 시간 1 증가
            
    return spend // jobCount