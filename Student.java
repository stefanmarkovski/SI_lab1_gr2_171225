class Student {
	String index;
	String firstName;
	String lastName;
	int[] grades;
	
	//TODO constructor
		public Student(String index, String firstName, String lastName) {
			index = this.index;
			firstName = this.firstName;
			lastName = this.lastName;
		}
		
		//TODO seters & getters
		public void setIndex(String index) {
			this.index = index;
		}
		
		public getIndex() {
			return index;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public getFirstName() {
			return firstName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public getLastName() {
			return lastName;
		}
		
		public double getAverage() {
			//TODO
			float average;
			int sum = 0;
			int numberOfGrades = 0;
			for(int i = 0; i < grades.length; i++) {
				sum += grades[i];
				numberOfGrades++;
			}
			average = (float)sum / numberOfGrades;
			return average;
		}

		public int ECTSCredits() {
			//TODO
			int ectsCredits = 0;
			for(int i = 0; i < grades.length; i++) {
				if(grades[i] > 5) {
					ectsCredits += 6;
				}
			}
			return ectsCredits;
		}
	}
}

class Faculty extends Student {
	List<Student> listaStudenti = new ArrayList<Student>();
	String imeNaFakultet;
	
	Faculty(List<Student> listaStudenti, String imeNaFakultet) {
		for(int i = 0; i < listaStudenti.size(); i++) {
			this.listaStudenti[i] = listaStudenti;
		}
		this.imeNaFakultet = imeNaFakultet;
	
		public double ProsecnaOcenka() {
			int brojNaProsecniOcenki = 0;
			double prosecnaOcenka = 0;
			int suma = 0;
			for(int i = 0; i < listaStudenti.size(); i++) {
				prosecnaOcenka = listaStudenti[i].getAverage();
				suma += prosecnaOcenka;
				brojNaProsecniOcenki++;
			}
			double prosek;
			prosek = suma / brojNaProsecniOcenki;
			return prosek;
		}
	}
}