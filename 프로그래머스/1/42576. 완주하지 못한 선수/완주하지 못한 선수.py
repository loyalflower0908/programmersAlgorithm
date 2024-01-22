def solution(participant, completion):
    participant_dict = {}
    
    # 참가자들의 이름을 해시맵에 등록
    for p in participant:
        if p in participant_dict:
            participant_dict[p] += 1
        else:
            participant_dict[p] = 1
    
    # 완주한 선수들의 이름을 해시맵에서 등장 횟수 감소
    for c in completion:
        participant_dict[c] -= 1
    
    # 등장 횟수가 0이 아닌 이름이 완주하지 못한 선수
    for name, count in participant_dict.items():
        if count != 0:
            return name
