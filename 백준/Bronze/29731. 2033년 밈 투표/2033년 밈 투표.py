n = int(input())
p = "No"
for i in range(n):
    s = input()
    if not (s == "Never gonna give you up" or s == "Never gonna let you down" or s == "Never gonna run around and desert you" or s == "Never gonna make you cry" or s == "Never gonna say goodbye" or s == "Never gonna tell a lie and hurt you" or s == "Never gonna stop"):
        p = "Yes"
print(p)