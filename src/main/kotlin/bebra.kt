fun main()
{
    //Посчитать четные и нечетные цифры введенного натурального числа.
    //Например, если введено число 34560, то у него 3 четные цифры (4, 6 и 0) и 2 нечетные (3 и 5).
    print("Введите число:")
    var x:Int= readLine().toString().toInt()
    var countnech:Int=0;
    var countchet:Int=0;
    while(x!=0)
    {
        if(x%10%2==0)
            countchet++
        else
            countnech++
        x/=10
    }
    println("Кол-во чётных цифр в числе: $countchet")
    println("Кол-во неётных цифр в числе: $countnech")
}