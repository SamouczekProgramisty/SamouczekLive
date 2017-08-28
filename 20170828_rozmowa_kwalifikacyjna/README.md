# W ktorej czesci pamieci zlokalizowany jest StringPool?
- zależy od wersji Javy
- w “nowoczesnych” JVM jest to heap 
- http://bugs.java.com/view_bug.do?bug_id=6962931

# Jak zachowuje sie stringPool w sytuacji gdy przechowuje juz jakiś literał np “cat”, a zmusimy go do dodania nowego za pomoca String type = new String (“cat”)? Taki obiekt tworzony jest poza StringPoolem normalnie na stosie?
- powstaje nowy obiekt klasy String
- obiekty przechowywane są na stercie

# Jaki jest najprostszy przyklad dla memory leak w Java?
- dodawanie obiektu do mapy pod nowym kluczem za każdym razem [SimpleMemoryLeak]

# SOLID - literka L - czy w jednym zdaniu mozna powiedziec, ze chodzi o to aby "Klasa dziedzicząca powinna tylko rozszerzać możliwości klasy bazowej i w pewnym sensie nie zmieniać tego, co ona robiła już wcześniej?"
- Liskov Substitution Principle 
- podmiana rodzica przez dziecko

# SOLID - Literka D - Dependency Inversion Principle (DIP) - czy mozna powiedziec, ze sposobem osiagniecia DIP jest uzycie Inversion of Control poprzez zastosowanie Dependency Injection ?
- Dependency Inversion Principle
- Dependency Injection to rodzaj Inversion of Control
- “sposobem osiągnięcia Dependency Inversion Principle jest użycie Inversion of Control”

# Czy jest możliwy dostęp do prywatnego pola klasy z poziomu innej klasy?
- klasy wewnętrzne
- refleksja

# Czy w Javie mozna utworzyc destruktor, jak?
- try/finally
- AutoCloseable
- finalize

# Jesli dla danej klasy implementacja hashCode zawsze bedzie zwracac 1 - czy mozna uzyc takiej klasy jako klucza w Map? 
- tak, ale to nie jest wydajne

# Jaka jest najlepsza i najgorsza mozliwa zlozonosc obliczeniowa przy pobieraniu obiektu z Setu?
- Notacja Omikron (góra)
- Notacja Omega (dół)
- Notacja Theta (góra dół)
- nie pobieramy obiektu z setu (contains)
- O(1) / O(n) (Pytanie 8.)

# Dlaczego, klasa ktora jest niemutowalna musi(poza innymi wymaganiami) byc poprzedzona slowem final tak aby uniemozliwic jej dziedziczenie?
- nie mówimy o niemutowalności klasy a niemutowalności instancji
- instancje klasy, która nie jest finalna mogą być niemutowalne
- instancje klasy, która jest finalna mogą być mutowalne
