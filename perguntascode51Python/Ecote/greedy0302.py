# n,m,k =map(int,input().split())
# data =list(map(int,input().split()))
#
#
# data.sort()
# first=data[n-1]
# second = data[n-2]
#
# result =0
#
# while True:
#     for i in range(k):
#         if m ==0:
#             break
#         result += first
#         m-=1
#     if m ==0:
#         break
#     result += second
#     m-=1
# print(result)

















n,m,k = map(int,input().split())
data=list(map(int,input().split()))

answer=0
count=0
data.sort()
first=data[n-1]
second=data[n-2]


while True:
    if m==0:
        break
    for i in range(k):
        answer+=first
        m-=1

    if m==0:
        break
    answer +=second
    m-=1
print(answer)
