/killall
/message var 0
/var chname ����
/var name testnut
/var sex m
/var passwd 00000
/var yesa 0
/var yesb 0
/var BL 9
/var DS 9
/var WX 28
/var LX 15
/var DL 11
/var RM 9
/var GG 15
/var FY 28
/ac {������[%0]%1��ʶ��[%2]%3���ԣ�[%4]%5���ԣ�[%6]} {/math bl %0;/math ds %2;/math wx %4;/math lx %6;chk1} {2}
/ac {������[%0]%1��ò��[%2]%3���ǣ�[%4]%5��Ե��[%6]} {/math dl %0;/math rm %2;/math gg %4;/math fy %6;chk2} {2}
/al chk1 {/showme $bl $ds $wx $lx;/if {$bl>$BL && $ds>$DS && $wx=29 && $lx>$LX} {/var yesa 1}}
/al chk2 {/showme $dl $rm $gg $fy;/if {$dl>28 && $rm>$RM && $gg>$GG && $fy>$FY} {/var yesb 1}}

/var idle 0
/tickon
/ticksize 10
/act {^#TICK!!!} {/if {$idle=1} {/cr};/math idle 1}
/ac {��ͬ�������츳��ֵ��[n|y|q]} {/var idle 0;/if {($yesa=1)&&($yesb=1)} {y;/cr;/bell;beforequit;quit;quit};/var yesa 0;/var yesb 0;n}}
/al beforequit {/all /ig}

/ac {�㷢�����鲻����ˣ�������˵��������} {/z}
/ac {����Ӣ�����֣�} {$name}
/act {��������Ӧ���룺} {$passwd;$chname;$passwd;$passwd;;$sex}
/ac {�����ȷ����(y/n)��} {y;$chname;$passwd;$passwd;;$sex}
/alias {xyj} {/ses {%%0} {202.105.177.101 6666}}
/al aa {/loop {1,3} {xyj a%0;/nop snoop a%0}}
/ses ox {0 0};/ox /tickon;/ox /ticksize 10;/ox /act {^#TICK!!!} {aa}
aa;/a1
