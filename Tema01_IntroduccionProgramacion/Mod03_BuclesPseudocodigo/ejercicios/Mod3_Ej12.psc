Algoritmo Mod3_Ej12
	Definir i, base, exponente, potencia Como Entero
	Definir exponenteCalculo Como Entero
	
	Escribir "Introduzca la base"
	Leer base
	Escribir "Introduzca el exponente"
	Leer exponente
	
	potencia<-1
	
	Si exponente>0 Entonces
		exponenteCalculo<-exponente
	SiNo
		exponenteCalculo<-exponente*(-1)
	FinSi
	
	Para i<-1 Hasta exponenteCalculo Con Paso 1 Hacer
		potencia<-potencia*base
	Fin Para
	
	Si exponente>0 Entonces
		Escribir potencia
	SiNo
		Escribir 1/potencia
	FinSi
	
	
FinAlgoritmo
