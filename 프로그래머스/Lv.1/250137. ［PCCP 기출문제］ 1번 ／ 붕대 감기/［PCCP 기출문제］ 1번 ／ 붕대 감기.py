def solution(bandage, health, attacks):
    hp = health
    now = 0
    for attack in attacks:
        attackTime = attack[0] - now
        healTime = attackTime - 1
        #초당 회복량
        hp += healTime * bandage[1]
        #추가 회복량
        if healTime >= bandage[0]:
            hp += (healTime // bandage[0]) * bandage[2]
        if hp > health:
            hp = health
        #피해량
        hp -= attack[1]
        now += attackTime
        if hp <= 0 :
            return -1
    return hp
    