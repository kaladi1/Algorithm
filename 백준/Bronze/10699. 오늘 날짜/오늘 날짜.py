from datetime import date
print(date.today())

#datetime 클래스로 구현
from datetime import datetime
date = datetime.today().strftime('%Y-%m-%d')
print(date)