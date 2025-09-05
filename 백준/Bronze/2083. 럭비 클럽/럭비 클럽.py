import sys

input = sys.stdin.readline

while True:
  name, age, kg = map(str, input().rstrip().split())

  if name == '#' and age == '0' and kg =='0':
    break
  elif int(age) > 17 or int(kg) >= 80:
    print(name, 'Senior')
  else:
    print(name, 'Junior')