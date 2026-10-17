Algoritmo Ejercicio_13
	//Dibuja un ordinograma de un programa donde el usuario "piensa" un
	//número del 1 al 100 y el ordenador intenta adivinarlo. 
	//Responder MAYOR o MENOR
	
	Definir max, min, num, anterior Como entero
	Definir respuesta Como Caracter
	Definir seguir Como Logico
	
	seguir<-Verdadero
	max<-100
	min<-0
	anterior<-0
	
	Mientras seguir Hacer
		num<-trunc((max+min)/2)
		Si num=anterior Entonces
			num<-num+1
		FinSi
		Escribir "¡El numero es ",num,"? (=, < o >)" 
		Leer respuesta
		Segun respuesta Hacer
			"<":
				max<-num
				anterior<-num
			">":
				min<-num
				anterior<-num
			"=":
				seguir<-falso
			Fin Segun
	Fin Mientras
	Escribir "¡¡Lo he acertado!!"
	
FinAlgoritmo
