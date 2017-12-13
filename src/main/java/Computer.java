
public class Computer {
	
		
		//Instance Data  //keep this private its private to this class
		private String make; 
		private String model;
		private double price;
		
		//constructor //at the top
		public Computer(String make, String model, double price) {
			
			this.make = make;
			this.model = model;
			this.price = price;
			}
		
		public Object getMake() {
			return make;
		}
		
		@Override
		public String toString() {
			return make;
		}
		@Override
		public boolean equals(Object obj) {
			
			Computer theOther = (Computer) obj;
			
			return this.make == theOther.make;
		}

}
