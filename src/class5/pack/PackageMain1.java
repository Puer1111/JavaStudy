package class5.pack;

import class5.pack.a.User;  // 지금은 a패키지에 User 하나지만 여러개가 되면 import 가 늘어나니까 User 대신에 *을 붙힌다.

public class PackageMain1 {
    public static void main(String[] args) {
        Data data =  new Data(); // 같은 패키지에 있으면 그냥 쓰면 된다.
        User user = new User(); // 다른 패키지 같은 경우 원래는 pack.a.User라고 작성해야 하는데 위에 import 를 통해 패키지 삽입 된다.
    }
}
