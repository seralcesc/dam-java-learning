Algoritmo Ejercicio_14
	
	//Dada una cantidad en euros, mostrar el número mínimo de billetes
	//para alcanzar dicha cantidad (500,200,100,50,20,10,5)
	
	Definir cantidad, billeteCandidato, numBilletes Como Entero
	
	Escribir "Introduzca una cantidad en euros"
	Leer cantidad
	
	billeteCandidato<-500
	Repetir
		numBilletes<-trunc(cantidad/billeteCandidato)
		cantidad<-cantidad%billeteCandidato
		Escribir "Billetes de ",billeteCandidato," = ",numBilletes
		Segun billeteCandidato Hacer
			500:
				billeteCandidato<-200
			200:
				billeteCandidato<-100
			100:
				billeteCandidato<-50
			50:
				billeteCandidato<-20
			20:
				billeteCandidato<-10
			10:
				billeteCandidato<-5
			5:
				cantidad<-0
		Fin Segun
	Hasta Que cantidad=0
	
FinAlgoritmo
