
public class TestObject2 {

	int a ;
	int b ;
	String c;
	public TestObject2(int a,int b,String c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public boolean equals(Object o){
		if(!( o instanceof TestObject2)){
			return false;
		}
		TestObject2 o2 = (TestObject2)o;
		if(o2.a==this.a&&o2.b==this.b&&o2.c.equals(this.c)){
			return true;
		}else{
			return false;
		}
	}
	public int hashCode(){
		int result = a;
		result = 29 * result +b;
		result = 29 * result +c.hashCode();
		return result;
	}
}
