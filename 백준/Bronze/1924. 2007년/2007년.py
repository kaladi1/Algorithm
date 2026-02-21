days_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

weekdays = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]

x, y = map(int, input().split())

total_days = sum(days_in_month[:x-1]) + y - 1

target_weekday = weekdays[total_days % 7]

print(target_weekday)