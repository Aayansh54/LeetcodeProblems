int rotatedDigits(int n) {
    int i ,cnt = 0,digit,temp,flag,good_no;
    for ( i = 1 ; i <= n ; i++ )
    {   flag = 1;
        good_no = 0;
        temp = i;
        while(temp > 0 ){
            digit = temp % 10;
            if(digit == 2 || digit == 5 || digit == 6 || digit == 9 )
            {
               good_no = 1;
            }
            else if(digit == 3 || digit == 4 || digit == 7)
            {
            flag = 0;
            break;
            }
            temp = temp/10;
        }
        if( flag == 1 && good_no == 1) cnt ++;
    }
    return cnt;
}