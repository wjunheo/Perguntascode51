coin_total= 1260
count=0
coins =[500,100,50,10]


for i in coins:

        count+= coin_total // i
        coin_total= coin_total % i


print(count)
