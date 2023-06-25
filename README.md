#  Java Polymorphism

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:

 * Bugün ki projemizde toplamda 4 tane sınıf oluşturman istenmektedir.
 * İlk sınıfımız ```Car``` isimli sınıfmız olmalı.
 * ```Car``` sınıfı diğer oluşturacağımız 3 sınıf olan ```Mitsubishi```, ```Holden```, ```Ford``` sınıflarının parent sınıf olacak.
   * ```Car``` sınıfı 4 adet ```instance variable``` içermeli.
        
        engine => boolean
   
        cylinders => int
   
        name => String
   
        wheels => int
   
   * Bu 4 değişkende ```private``` olarak tanımlanmalı
   * Car sınıfı için tek bir ```constructor``` tanımlanmalı. Constructor sadece 2 değeri dışarıdan almalı cylinders ve name değerlerini. İlgili 3 arabanın da motoru bulunduğu için ve 4 tekeri olduğu için contructor metodu içerisinde bu değerler default olarak set edilmeli. Dışarıdan parametre olarak alınmaya ihtiyaç duyulmamalı.
   * name ve cylinders parametreleri için getter metodlarını tanımlayınız.
   * Car sınıfı için toString ve equals methodlarını da ```Override``` etmelisin. Equals metodu için name ve cylinders alanları birlikte eşitliği kontrol etmeli.
   * Car sınıfı içerisinde aşağıdaki 3 metod tanımlanmalı
   * ```startEngine()``` hiçbir parametre almayacak ```the car's engine is starting``` mesajını dönmeli.
   * ```accelerate()```  hiçbir parametre almayacak ```the car is accelerating``` mesajını dönmeli.
   * ```brake()``` hiçbir parametre almayacak ```the car is braking``` mesajını dönmeli.
   * Ayrıca bu 3 metodunda içerisinde ```getClass().getSimpleName()``` değeri loglanmalı.
   * ```Mitsubishi```, ```Holden```, ```Ford``` sınıfları ```Car``` sınıfının alt sınıflarıdır ve bu 3 metoduda ```Override``` etmeliler.

Aşağıdaki gibi bir input değeri için output kısmında her araç türünün kendi override edilmiş metodunun çağırıldığından emin olmalısın.

### INPUT

Car car = new Car(8, "Base car");

System.out.println(car.startEngine());

System.out.println(car.accelerate());

System.out.println(car.brake());

Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

System.out.println(mitsubishi.startEngine());

System.out.println(mitsubishi.accelerate());

System.out.println(mitsubishi.brake());

Car ford = new Ford(6, "Ford Falcon");

System.out.println(ford.startEngine());

System.out.println(ford.accelerate());

System.out.println(ford.brake());

Car holden = new Holden(6, "Holden Commodore");

System.out.println(holden.startEngine());

System.out.println(holden.accelerate());

System.out.println(holden.brake());
