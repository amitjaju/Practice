//public class TestLambda {
//
//    public static void main(String[] args) {
//        MyFunctionInterface mylm=(int a,int b)-> a* b;
//        int result= mylm.calculate(10,5);
//        System.out.println(result);
//    }
//}
//@FunctionalInterface
//interface MyFunctionInterface{
//    int calculate(int a,int b);
//}
//
//
//   class UpdateTest{
//    @Mock
//    private  UpdatedRespository updatedRespository;
//
//    @InjectMock
//     private UpdatedService updatedService;
//
//
//    private void setUp(){
//
//    }
//
//    public void testUpdateData(){
//        doNothing().when(updatedRespository).update(any());
//        UpdatedService.updateData();
//        varify(updatedRespository,times(1)).update(any());
//    }
//
//   }