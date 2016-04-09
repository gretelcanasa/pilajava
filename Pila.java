public class Pila<T>{
	private T[] elems;
	private int position= -1;
	
	public Pila(){
		this(100);
	}
	public Pila(int size){
		elems= [ T[] ]new Object[size];
	}
	public T pop() throws Exception{
		if(position<0){
			throws new Exception("underflow");
		}
		return elems[position--];
	}
	public  void push(T size) throws Exception {
		if(position > elems.length -1)
		{
			throws new Exception ("overflow");
		}
		elems[++position]=elem;
	}
}