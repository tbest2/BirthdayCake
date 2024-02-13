package cs301.birthdaycake;

public class CakeController {
CakeView viewObj;
CakeModel modelObj;

CakeController(CakeView obj){
    viewObj = obj;
    modelObj = obj.getModel();

}



}
