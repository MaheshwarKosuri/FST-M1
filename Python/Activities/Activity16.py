class Car:
    'This is a brand new car'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer +" with model "+self.model +" is moving")

    def stop(self):
        print(self.manufacturer +" with model "+self.model +" is stopped")


car1 = Car("Hyundai","i20","2022","Manual","Black")
car2 = Car("Maruti","Swift","2021","Manual","Red")
car3 = Car("Tata","Harrier","2020","Automatic","Blue")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()