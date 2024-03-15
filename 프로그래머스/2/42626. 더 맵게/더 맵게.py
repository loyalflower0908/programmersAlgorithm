import heapq

def solution(scoville, K):
    heapq.heapify(scoville)  # scoville 리스트를 heap으로 변환
    mix_count = 0
    
    while len(scoville) > 1:
        if scoville[0] >= K:
            return mix_count
        
        # 가장 맵지 않은 음식과 그 다음으로 맵지 않은 음식을 섞기
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        mixed_scoville = first + (second * 2)
        heapq.heappush(scoville, mixed_scoville)
        
        mix_count += 1
    
    # 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
    if scoville[0] < K:
        return -1
    
    return mix_count