/al poisonact {/bell;halt;Quit}

/var {timeOvercmds} {5}
/al {overcmds} {l yao guai $nYaoguai}
/al Overcmds {/if {$overcmds=0}{/var overcmds 1;/purge;/ig 1;tick- F2;tick- tickft;/tickoff;/sleep $timeOvercmds;/var overcmds 0;/ig 0;upTime {overcmds;/tickon}}}
/act {�����ǰһ��} {tick- tickft;tick- F2;huti 0}
/act {����ϥ��} {ctask}
/act {�����������������ۣ�����ʹ�þ���} {eff +}
/al deadact /nop
/al aliveAct {set brief 3;tick+ bell 5;relogin}
/act {�ϳǿ�ջ} {/var place kz}
/act {��ȫ���ڲ�} {/if {[$place=kz]}{w;lsh 1;lastact}}
/al svFrd {/var done 1;get yao guai;Que {/loop {1,4}{get yao guai %0};upTime Que {/if {[$type=get]}{escfly endSeq};/if {[$type=quan]}{escfly {get yao from yao guai;get fen from yao guai;/if {[$WP=qinghong sword]}{get $WP from yao guai;dp sword 4}}};/if {[$type=kill]}{escfly {get yao from yao guai;get fen from yao guai;/if {[$WP=qinghong sword]}{get $WP from yao guai;dp sword 4};dp yao guai;kill yao guai;/al fdead fdead1;/al noppl fdead}}}}}
/act {�����һ����} {/nop laster can add to check if enuf ҩ left}
/act {$frd��������} {/if {[$type=quan]}{w;e;fight yao guai;Quan}}
/act {$frd���ˡ�} {/var done 2;gc yao;gc fen;/if {[$WP=qinghong sword]}{gc $WP;dp sword 4};fdead}
/act {$frd������}{/var mihun 1;/sleep 30;/var mihun 0}
/act {���ط硹Ҫ��} {/if {[$menpai=moon]}{time;enable dodge moondance;ext;enable dodge none}}
/act {��Ҫ��˭ʩչ����ѩ��}{/if {[$menpai=moon]}{/var inext 0}}
/al fdead0 {/sleep 3;escfly endSeq}
/al fdead1 {/sleep 3;endSeq;/al fdead fdead0}
/al fdead fdead0
/act {�����ֹս����} {/if {0 && $difflvl<2 && [$type!=xiang]}{escfly endSeq} else {seq$nSeq;/math nSeq $nSeq+1;ft guai;aa}}
/act {����û�� yao guai %0��}{escfly {/math first $first-1;/sleep 5;autotask}}
/act {��Ҫ��˭ʩչ����������С�}{escfly {/math first $first-1;/sleep 5;autotask}}
/act {������Ҫ��Ȼ�Ұ�����ˡ�}{escfly {/math first $first-1;/sleep 5;autotask}}
/act {���빥��˭��}{/if {$first=1}{escfly {/math first $first-1;/sleep 5;autotask}}}
/act {$frd���˹���}{/if {$doSeq && ($first=1 || $difflvl=10 || [$type=xiang])} {/var doSeq 0;Escfly {/math first $first-1;/sleep 5;autotask}}}
/var eatyao 1
/nop act {��Ҫ��ʲôҩ��}{/if {$eatyao}{/var eatyao 0;escRecover;/sleep 5;/var eatyao 1}}
/act {�޷�����} {/5 f4;f2;att3 1}

/act {$frd�������} {/var WP xuanhua fu;hdGuai$menpai}
/act {$frd������} {/var WP xuanhua fu;hdGuai$menpai}
/act {$frd����һ����} {/var WP xuanhua fu;hdGuai$menpai}
/act {$frd�ȵ����㿴�У�} {/var WP xuanhua fu;hdGuai$menpai}
/act {$frdһ����} {/var WP xuanhua fu;hdGuai$menpai}
/act {$frdһ��Ƴ��} {/var WP xuanhua fu;hdGuai$menpai}

/act {��ķ��������}{updata}
/al overcf3 updata
/al overcf2 updata
/al breakwp {/var mywpbroken 1;/if {[$menpai!=putuo] && [$menpai!=putuo] && [$menpai!=jjf]}{/var wp qinghong sword;remove shield;unwield $wpa;wld;wear all}}
/act {����������������} {/sleep 3;zchan 2;chk {cancel;/if {$mywpbroken}{relogin} else {/if {$nei+30<$Nei*2 || $Nei/10>$forcea-1}{zchan 1} else {cf2 50;/al finishcf2 {/al finishcf2 /nop;/sleep 3;zchan 1}}}}}
/act {$_CYN$frd˵������˵��Ҳ��} {/var done 1;/sleep 3;escfly endSeq} {3}
/act {$_CYN$frd˵�������������} {/if {[$type=quan]}{/var okquan 1}}{3}

/act {$_CYN$frd���һ��}{/if {[$type=xiang]}{ht}}
/act {$_CYN$frd˵�����һ�û�þ�}{/if {[$type=xiang] && $cancel=0}{/var win 1;/if {$nei*2>$Nei*3}{/sleep 3;/var doSeq 1;l} else {tick- tickft;tick- F2;/sleep 3;Que escfly {lsh 1;att3 1;Finisht chkJinchuang {/2 ctask;upTime cctask}}}}}{3}
/act {$_CYN$frd˵�������ƽ��}{/if {[$type=xiang] && $cancel=0 && ([$menpai!=wdd] || $first!=1)}{/if {$nei*2>$Nei*3}{/sleep 3;/var doSeq 1;l} else {tick- tickft;tick- F2;/sleep 3;Que escfly {lsh 1;att3 1;Finisht chkJinchuang {/2 ctask;upTime cctask}}}}}{3}
/act {$_CYN$frd˵��������������}{/if {[$type=xiang] && $cancel=0 && ([$menpai!=wdd] || $first!=1)}{/if {$nei*2>$Nei*3}{/sleep 3;/var doSeq 1;l} else {tick- tickft;tick- F2;/sleep 3;Que escfly {lsh 1;att3 1;Finisht chkJinchuang {/2 ctask;upTime cctask}}}}}{3}
/act {$_CYN$frd˵������������} {give 1 $yao to yao guai $nYaoguai;fight yao guai $nYaoguai;aa} {3}
/act {$_CYN$frd˵������������}{tick- tickft;Que {/sleep 3;escfly endSeq}}{3}

/act {$_HIYͻȻ�䣬��������һֻ���ְ�����} {escRecover}
/var flyinft 1
/act {������ս�����ɲ�����}{/if {$flyinft}{/var flyinft 0;flyinft;/sleep 3;/var flyinft 1}}
/al flyinft {/if {$done}{Que escfly endSeq} else {/if {$cancel}{cancelTask} else {Que Escfly {lsh 1;att3 1;Finisht chkJinchuang {/2 ctask;upTime cctask}}}}}

/al myyiyang {/if {$difflvl=1 && $QC_unarmed && $exp<20000000}{arm 0;/al abdact0 {/if {[$abdskill=�˻���֮��]}{arm 1;/var QC_unarmed 0}}};/if {[$type=quan] && $fHurt2>=-40 && $okquan=0}{/sleep 1.5;quan yao guai} else {/if {[$type!=xiang] && 0 && (($difflvl>2 && $fHurt0>=40) || ($difflvl>1 && $fHurt0>=60) || ($difflvl=1 && $fHurt0>=100)) || [$type=quan]}{/sleep 1.5;/if {$done=0}{cst1}}}}

/nop HERE are actions for enemy pfms
/act {$frd��Բ���ķ�}{/var ehuti huifeng;/if {$difflvl>0 && [$menpai!=moon]}{dd 0}}
/al wxAct {/if {[$menpai!=moon]}{eff 0};/var ehuti wx;/if {[$menpai=putuo]}{arm 2}}
/al nxAct {/math _clockEhuti $_clock;/if {[$type=xiang]}{surrender} else {escRecover;eff 0};/var ehuti nx}
/al nxdone {/var ehuti 0;/if {[$type=kill] || $fHurt0<=-10 || $fHurt0>=10 || {[$menpai!=putuo]}}{eff +}}

/act {������������Ҫ��������} {enable dodge $klDodge;perform dhwl;enable dodge none}
/act {������ʹ���ڹ�������} {/if {[$menpai=wdd] && [$inext!=0]}{remove shield;wield $wp;wear all;ext;unwield $wp}}
/act {����������ջ�˫ָ} {/if {$doDuo}{/var doDuo 0;huti 0;Que {dp $WP;remove shield;wld;wear shield;upTime escRecover}}}

/act {$frdͬʱʹ�����} {/if {($difflvl>5 || [$menpai!=putuo]) && [$type=xiang]}{cancelTask} else {f2;/if {[$menpai!=jjf]}{/5 eat $yao;dd 0}}}
/act {$frdһ������������} {f2;/if {[$menpai!=jjf]}{/5 eat $yao}}
/act {$frd����һ����} {f2;/if {[$menpai!=jjf]}{/5 eat $yao};/if {([$menpai=putuo] || [$menpai=lg]) && $difflvl>0}{arm 0}}
/act {$frd˫�ֻ�һ} {/if {$difflvl>0}{f2;/if {0 && [$type=xiang]}{cancelTask}};/if {[$menpai!=jjf]}{/5 eat $yao};f2}
/act {$_HIY$frd���޶���} {/if {$difflvl>5 || [$menpai!=putuo]}{cancelTask}}
/act {^$frd���㾫������} {/if {$difflvl>5}{cancelTask}}
/act {^$frd���㾫��һ������} {/if {$difflvl>5}{cancelTask}}
/act {$frd�ѻ�����������������һ�ܣ�ֻ������ɱ�����ڣ���˭����˳�ۡ�}{/nop}
/act {$_HIG$frd������Ԫ��}{/if {$difflvl>5 || ($difflvl>5 && [$type=xiang])}{cancelTask}}
/act {$_HIC$frd������Ԫ��}{/if {$difflvl>5 || ($difflvl>5 && ([$type=xiang] || [$menpai!=putuo]))}{cancelTask}};/nop jianzhang
/act {$_HIW$frd��Ȼ�������}{/if {$difflvl>5}{cancelTask}}
/act {$frd����ʽ����һ�룬����ͻȻһ������}{/nop if {$fHurt0>10 || [$type=kill]}{eff +};/if {$difflvl>5}{cancelTask}}
/act {$frd��ȫ��������˫��}{/if {$difflvl>5}{cancelTask} else {/nop eff +}}
/act {$frd�������ʳָ} {/if {[$menpai=putuo] && $difflvl<6}{tick+ F2 1} else {cancelTask}}
/act {$frd���������д�} {/var ldlh 1;cancelTask}
/act {$_HIC$frd����һ������ƮƮ��ָ����} {cancelTask}

/act {m������} {/math tmp $nSeq-1;/var outdoor$tmp 1;/var OUTDOOR 1;showtask}
/act {m̫��} {/math tmp $nSeq-1;/var outdoor$tmp 1;/var OUTDOOR 1;showtask}
/act {m����������} {/math tmp $nSeq-1;/var outdoor$tmp 1;/var OUTDOOR 1;showtask}
/act {mһ�ֻ��} {/math tmp $nSeq-1;/var outdoor$tmp 1;/var OUTDOOR 1;showtask}
/act {mҹ������} {/math tmp $nSeq-1;/var outdoor$tmp 1;/var OUTDOOR 1;showtask}
/act {mҹĻ} {/math tmp $nSeq-1;/var outdoor$tmp 1;/var OUTDOOR 1;showtask}
