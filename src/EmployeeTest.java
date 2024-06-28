//public class EmployeeTest {
//}
//
//@RestController
//public class UserController{
//    @Autowired
//    private UserSertive userService
//    @GetMapping("/process/{userId}")
//    publuc void getProcessUser(@PathVariable(user_id) Long userId){
//        return userService.getProcessUser(userId);
//    }
//}
//@Service
//public class UserService{
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private UserAddressRepository userAddressRepository;
//
//    @Autowired
//    private UserDemographyReposiotry userDemographyReposiotry;
//    User user=UserRepository.findById(userId);
//    @Transaction(progration=Propgration.REQUIRED,RollBackfor=Exception.class)
//    public  void getProcessUser(Long userId){
//
//        UserAddress userAddress=new UserAddress(user.getAddress());
//        UserDemography userDemography=new UserDemography(user.getdetails);
//        UserAddressRepository.save(userAddress);
//        UserDemographyReposiotry.save(userDemography);
//    }
//
//}
//@Repository
//interface UserAddressRepository extends JPARepository<UserAddress,Long>{
//
//}
//@Repository
//interface UserDemographyReposiotry extends JPARepository<UserAddress,Long>{
//
//}
//@Repository
//interface UserRepository extends JPARepository<UserDemography,Long>{
//
//}
//
//
