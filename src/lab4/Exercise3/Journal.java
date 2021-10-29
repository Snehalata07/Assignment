package lab4.Exercise3;

	public class Journal extends Written {
		private int year;

		public Journal(int idNum, String title, int numCopies, String author, int year) {
			super(idNum, title, numCopies, author);
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public void print() {
			super.print();
			System.out.println("Year: " + year);
		}

	}

