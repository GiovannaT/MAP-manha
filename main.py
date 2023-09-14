class FrenchLocalizer:


	def __init__(self):

		self.translations = {"car": "voiture", "bike": "bicyclette",
							"motorcycle":"monete"}

	def localize(self, msg):

		return self.translations.get(msg, msg)

class SpanishLocalizer:

	def __init__(self):

		self.translations = {"car": "coche", "bike": "bicicleta",
							"motorcycle":"motocicleta"}

	def localize(self, msg):

		return self.translations.get(msg, msg)
		
class BrrueLocalizer:

	def __init__(self):

		self.translations = {"car": "carro", "bike": "bicicleta",
							"motorcycle":"moto"}

	def localize(self, msg):

		
		return self.translations.get(msg, msg)		

class EnglishLocalizer:

	def localize(self, msg):
		return msg

if __name__ == "__main__":

	f = FrenchLocalizer()
	e = EnglishLocalizer()
	b = BrrueLocalizer()
	s = SpanishLocalizer()

	message = ["car", "bike", "motorcycle"]

	for msg in message:
		print(f.localize(msg))
		print(e.localize(msg))
		print(b.localize(msg))
		print(s.localize(msg))
