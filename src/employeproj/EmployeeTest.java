//package employeproj;
//
//public class EmployeeTest {
//    @Mock
//    private EmployeeRepository employeeRepository;
//    @InjectMocks
//    private EmployeeService employeeService;
//
//    public void setUp(){
//        MockAnnotions.openMocks(this);
//    }
//    @Test
//    public void getEmployeeId(){
//        Long EmployeeId=1L;
//        Employee mockEmployee=new Employee();
//        mockEmployee.setId(EmployeeId);
//        mockEmployee.setName("John deo");
//
//        Mockito.when(employeeRepository.getEmployeeId(anyLong()))
//                .thenReturn(mockEmployee);
//
//        Employee returndetail=employeeService
//                .getEmployeeId(EmployeeId);
//        Assertions.assertNotNull(returndetail);
//        assertEquals("John deo",returndetail.getName());
//        Mockito.verify(employeeRepository,
//                Mockito.times(1).getEmployeeById(EmployeeId));
//    }
//}
