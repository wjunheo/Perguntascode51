# 2에서 x-1 까지 나누어보면 됨

# def primeNumber(x):
#     for i in range(2,x):
#         if x % i ==0:
#             return False
#
#     return True

from itertools import permutations
# permutations 순열조합

def solution(numbers):
    answer =[]
    nums = [n for n in numbers]
    # numbers 하나씩 자름
    per =[]
    for i in range(1, len(numbers)+1):
        per += list(permutations(nums,i))
        # permutations(nums,i))(객체, 몇자리 )조합

    new_nums =[int(("").join(p)) for p in per]

    for n in new_nums:
        if n <2:
            continue
        check = True
        for i in range (2,int(n**0.5) +1):
            if n % i ==0:
                check = False
                break
        if check:
            answer.append(n)

    return len(set(answer))
print(solution("17"))