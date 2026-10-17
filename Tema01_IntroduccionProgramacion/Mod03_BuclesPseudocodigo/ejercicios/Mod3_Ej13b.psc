Algoritmo Mod3_Ej13b
	//Dibuja un ordinograma de un programa donde el usuario "piensa" un
	//número del 1 al 100 y el ordenador intenta adivinarlo. 
	//Responder MAYOR o MENOR
	
	Definir max, min, num Como entero
	Definir respuesta Como Caracter
	Definir seguir Como Logico
	
	seguir<-Verdadero
	max<-100
	min<-0	
	num<-50
	
	Mientras seguir Hacer
		
		Escribir "¡El numero es ",num,"? (=, < o >)" 
		Leer respuesta
		Segun respuesta Hacer
			"<":
				max<-num				
			">":
				min<-num				
			"=":
				seguir<-falso
		Fin Segun
		
		Si num=99 Entonces
			num<-100
		SiNo
			num<-trunc((max+min)/2)
		FinSi
		
	Fin Mientras
	
	Escribir "¡¡Lo he acertado!!"
	
FinAlgoritmo
