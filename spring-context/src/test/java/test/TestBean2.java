package test;

public class TestBean2 {

	private TestBean field1;

	private Integer field2;

	public TestBean getField1() {
		return field1;
	}

	public void setField1(TestBean field1) {
		this.field1 = field1;
	}

	public Integer getField2() {
		return field2;
	}

	public void setField2(Integer field2) {
		this.field2 = field2;
	}

	@Override
	public String toString() {
		return "TestBean{" +
				"field1='" + field1 + '\'' +
				", field2=" + field2 +
				'}';
	}
}
