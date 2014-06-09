public class Rectangulo extends FiguraGeometrica{
	private double base;
	private double altura;
	public Rectangulo(double b, double h){
		this.base=b;
		this.altura=h;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura;
	}

}
