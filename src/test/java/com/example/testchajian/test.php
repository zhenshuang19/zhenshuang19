<?php
//echo phpinfo();
//echo "<br>";
//echo "Hello Word";
//?>
<?//
//echo "asd";
//print "sss";
//$str3 = <<<EOF
//    url：
//    http://c.biancheng.net/php/
//EOF;
//$a = 8895;
//var_dump($a);
//var_export($a);
//$b = -999;
//echo "<br>";
//var_dump($b);
//$c = 0x123;
//var_dump(is_numeric("0x123"));
//echo "<br>";
//var_dump($c);
//$d = 047;
//echo "<br>";
//var_dump($d);
//var_dump("0x123" == "291");
//echo "<br/>";
//var_dump(is_numeric("0x123"));
//echo "<br/>";
//var_dump("0xe" + "0x1");
//
//echo $a . "<br>".$b . "<br>" . $c ."<br>" . $d;
//echo $str3;
//?>

<?php
    $a = 1;
    $b = 2;
    $c = 3;
    function demo(){
        echo $GLOBALS ['a'];
        echo "变量 a：".$GLOBALS['a'];
        echo "<br>变量 b：".$GLOBALS['b'];
        echo "<br>变量 c：".$GLOBALS['c'].'<br>';
    }
    demo();
?>
<!--定义常量-->
<?php
define('WebSite', 'C语言中文网');
const url = 'http://c.biancheng.net/php/';
echo WebSite.'<br>';
echo url.'<br>';
define('int',555);
$num = 'int';
echo int.'<br>';
echo constant($num);
var_dump(defined('WebSite'));   //判断常量是否存在
echo "<br/>当前PHP的版本信息：".PHP_VERSION;
echo "<br/>当前的操作系统：".PHP_OS;
echo "<br/>当前的行数：".__LINE__;
echo "<br/>当前文件的路径：".__FILE__;
echo "<br/>";
?>

<?php
$website = 'C语言中文网';
$url = 'http://c.biancheng.net/php/';
$title = 'PHP 教程';

$str = <<<str
        <!DOCTYPE html>
        <html>
        <head>
            <title> $title </title>
        </head>
        <body>
            您正在访问的是：<strong style="color:#00f7ff">$website</strong><br>
            网址：<a href="$url" target="_blank" style="color: red">$url</a>
        </body>
        </html>
str;
echo $str."<br>";
?>
<?
$a = 9;
$b = 6;
echo '$a = '.$a.', $b = '.$b.'<br>';
echo '$a += $b 的值为：'.($a += $b).'<br>';
echo '$a -= $b 的值为：'.($a -= $b).'<br>';
echo $a == $b.'<br>';
echo $a === $b.'<br>';
?>
<?php
$a = 1;
$c = 0;
$b = '1';
if ($a && $c){
    echo '为真'.'<br>';
}else{
    echo '为假'.'<br>';
}
if ($a || $c){
    echo '为真'.'<br>';
}else{
    echo '为假'.'<br>';
}
if ($a == $b){
    print '为真'.'<br>';
}else{
    echo '为假'.'<br>';
}
if ($a === $b){     //=== 不仅值相等，类型也相等
    echo '为真'.'<br>';
}else{
    print '为假'.'<br>';
}
?>
<?php
$a = 10;
$b = 7;
$a % 2 == 0 ? print '$a 是偶数！<br>' : "";
$b % 2 == 0 ? '' : print '$b 是奇数！<br>';
?>

<?php
for ($i = 1; $i <= 9; $i++) {
    for ($j = 1; $j <= $i; $j++) {
        echo $j.' * '.$i.' = '.$i*$j.'&nbsp;&nbsp;';
    }
    echo '<br>';
}
?>

<?php
$str = 'hello,world,hello,world';
$replace = 'hi';
echo substr_replace($str, $replace, 0,6)."<br>";
?>

<?php
$str = 'hello,world,hello,world';
$replace = 'hi';
$search = 'world';
echo str_ireplace($search, $replace, $str);
?>
