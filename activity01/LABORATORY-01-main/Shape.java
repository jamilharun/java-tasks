package asd;


	public abstract class Shape {
		private String color;
		public Shape(String color) {
			this.color = color;}
		public abstract double calculateArea();
		public String getColor() {
			return color;}
		public void getColor(String color) {
			this.color = color;}}

