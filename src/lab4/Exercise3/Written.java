package lab4.Exercise3;

	public abstract class Written extends Item {
		private String author;
			
			public Written(int idNum, String title, int numCopies, String author) {
				super(idNum, title, numCopies);
				this.author = author;
			}

			public String getAuthor() {
				return author;
			}

			public void setAuthor(String author) {
				this.author = author;
			}
			
			@Override
			public void print() 
			{
				super.print();
				System.out.println("Author: " + author);
			}

		}

