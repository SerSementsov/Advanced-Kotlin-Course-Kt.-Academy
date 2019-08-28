import org.junit.Test
import org.junit.Assert

class PersonTest {

    @Test
    fun businessmanImplementsPerson() {
        Assert.assertTrue("Businessman needs to be a person", Businessman("AAA", 30) is Person)
    }

    @Test
    fun studentImplementsPerson() {
        Assert.assertTrue("Student needs to be a person", Student("AAA", 30) is Person)
    }

    @Test
    fun personCanBuyAlcoholIfOver21() {
        Assert.assertTrue("Adult businessman can buy alcohol", Businessman("AAA", 30).canBuyAlcohol)
        Assert.assertTrue("Adult businessman can buy alcohol", Businessman("AAA", 21).canBuyAlcohol)
        Assert.assertTrue("Young businessman can' buy alcohol", !Businessman("AAA", 19).canBuyAlcohol)
        Assert.assertTrue("Young businessman can' buy alcohol", !Businessman("AAA", 17).canBuyAlcohol)
        Assert.assertTrue("Adult student can buy alcohol", Student("AAA", 30).canBuyAlcohol)
        Assert.assertTrue("Adult student can buy alcohol", Student("AAA", 21).canBuyAlcohol)
        Assert.assertTrue("Young student can' buy alcohol", !Student("AAA", 19).canBuyAlcohol)
        Assert.assertTrue("Young student can' buy alcohol", !Student("AAA", 17).canBuyAlcohol)
    }

    @Test
    fun testBusinessmanHelloText() {
        Assert.assertEquals("Good morning", Businessman("AAA", 30).helloText())
    }

    @Test
    fun testStudentHelloText() {
        Assert.assertEquals("Hi", Student("AAA", 30).helloText())
    }

    @Test
    fun testStudentGreetText() {
        val name1 = "Some name"
        val name2 = "Another name"
        val student = Student(name1, 12)
        val businessman = Businessman(name2, 12)
        Assert.assertEquals("Hey $name2, I am $name1", Student(name1, 30).cheerText(businessman))
        Assert.assertEquals("Hey $name1, I am $name2", Student(name2, 30).cheerText(student))
    }

    @Test
    fun testBusinessmanGreetText() {
        val name1 = "Some name"
        val name2 = "Another name"
        val student = Student(name1, 12)
        val businessman = Businessman(name2, 12)
        Assert.assertEquals("Hello, my name is $name1, nice to see you $name2", Businessman(name1, 30).cheerText(businessman))
        Assert.assertEquals("Hello, my name is $name2, nice to see you $name1", Businessman(name2, 30).cheerText(student))
    }
}