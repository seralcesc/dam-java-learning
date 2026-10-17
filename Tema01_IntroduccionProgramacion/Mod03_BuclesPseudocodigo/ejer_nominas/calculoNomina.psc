Algoritmo Mod3_ejerNomina
	
	Definir cargo, base, dias, extra, estado Como Entero
	Definir bruto, neto, retencion, irpf Como Real
	
	Escribir "Vamos a proceder al cálculo de tu nómina."
	
	Repetir
		Escribir "Indica tu cargo: 1.Prog.Junior | 2.Prog.Senior | 3.Jefe de Proyecto."
		Leer cargo
		
		Segun cargo
			1:
				base<-950
			2:
				base<-1200
			3:
				base<-1600
			De Otro Modo:
				Escribir "Opción incorrecta."
		FinSegun
	Hasta Que cargo>=1 Y cargo<=3
	
	Escribir "Indica cuántos días has estado de viaje: "
	Leer dias
	extra<-dias*30
	bruto<-base+extra
	
	Repetir
		Escribir "Indica tu estado civil: 1.Soltero | 2.Casado"
		Leer estado
		
		Segun estado
			1:
				irpf<-0.25
			2:
				irpf<-0.20
			De Otro Modo:
				Escribir "1.Soltero | 2.Casado."
		FinSegun
	Hasta Que estado==1 o estado==2
	
	retencion<-bruto*irpf
	neto<-bruto-retencion
	
	Escribir "Sueldo base: ", base, " euros."
	Escribir "Dietas: ", extra, " euros."
	Escribir "Sueldo bruto: ", bruto, " euros."
	Escribir "Retención IRPF: ", retencion, " euros."
	Escribir "Tu SUELDO NETO es de: ", neto, " euros."
FinAlgoritmo
