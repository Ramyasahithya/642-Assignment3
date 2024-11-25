/*
  Ramyasahithya Magani - G01425752
  Saichinmayee Yanamadala-G01459318
  Sreshta Kosaraju - G01460468
*/

/*A custom runtime exception used to handle cases where a specific resource is not found*/
package _5.hw.assignment3.surveyForm.exception;

public class ResourceNotFoundException extends RuntimeException{

    private static  final long serialVerisonUID= 1L;


    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFoundException(String resourceName,String fieldName,Object fieldValue){
        super(String.format("%s not found with %s:'%s'",resourceName,fieldName,fieldValue));
        this.resourceName=resourceName;
        this.fieldName=fieldName;
        this.fieldValue=fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

}
