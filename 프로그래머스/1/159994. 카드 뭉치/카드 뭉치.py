def solution(cards1, cards2, goal):
    for i in goal:
        check = 0
        if(len(cards1)!=0):
            if(i == cards1[0]):
                cards1 = cards1[1:]
                check = 1
        if(check == 0 and len(cards2)!=0):
            if(i == cards2[0]):
                cards2 = cards2[1:]
                check = 1
        if(check == 0):
            return "No"
    return "Yes"