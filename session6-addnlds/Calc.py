# Python does not support method overloading. We can use default arguments to achieve the same.
class Calc:
    def add(self, a=0, b=0):
        return a + b


calc = Calc()
print(calc.add())  # 0
print(calc.add(5))  # 5
print(calc.add(5, 10))  # 15
print(calc.add(5.6, 7.9))  # 13.5
