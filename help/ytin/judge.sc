/nop ����ļ���Ҫ /read ansi.sc
/act {$_CYN���й�˵����%1����%2��} {/ctoi tmpx {%%1};/ctoi tmpy {%%2};/math answer {$tmpx%%%%$tmpy};Answer} {3}
/act {$_CYN���й�˵����%1��ȥ%2��} {/ctoi tmpx {%%1};/ctoi tmpy {%%2};/math answer {$tmpx-$tmpy};Answer} {3}
/act {$_CYN���й�˵����%1����%2��} {/ctoi tmpx {%%1};/ctoi tmpy {%%2};/math answer {$tmpx+$tmpy};Answer} {3}
/act {$_CYN���й�˵����%1��%2�����} {/ctoi tmpx {%%1};/ctoi tmpy {%%2};/if {$tmpx<$tmpy} {/math tmpz $tmpx;/math tmpx $tmpy;/math tmpy $tmpz};gongyinshu} {3}
/act {$_CYN���й�˵����%1����%2����λ����} {/ctoi tmpx {%%1};/ctoi tmpy {%%2};/math answer {$tmpx*$tmpy%%%%10};Answer} {3}
/act {$_CYN���й�˵����%1����%2��} {/ctoi tmpx {%%1};/ctoi tmpy {%%2};/math answer {$tmpx*$tmpy};Answer} {3}
/act {$_CYN���й�˵�����ܺ�} {judgeout} {2}
/al judgeout /bell
/nop {$_CYN���й�˵��������򵥶����᣿�𰸵��%1��}
/var autoanswer 1
/al Answer {/if {$autoanswer=1} {answer $answer}}
/al gongyinshu {/if {$tmpy=0}{/math answer $tmpx;Answer} else {/math tmpz $tmpx;/math tmpx $tmpy;/math tmpy {$tmpz//$tmpx};gongyinshu}}
