/al deaddir go void;/nop dead direction
/var quedelay 0.3
/nop /al {cf2} {exercise %0;/al lastact exercise %0;/if {$que=1}{/math que 0;/act {���й����}{/math que 1;/unact {���й����};lastact} }}

/act {�����ڲ����ƶ�} {/if {$que=1 || $auto=1} {/sleep $quedelay;lastact;/math nact {$nact+1};/nop /if {$nact>40}{/math nact 0}}} {3}
/act {��Ķ���} {/if {$que=1 || $auto=1} {/sleep $quedelay;lastact;/math nact {$nact+1};/nop /if {$nact>40}{/math nact 0}}} {3}
/act {��������æ} {/if {$que=1 || $auto=1} {/sleep $quedelay;lastact;/math nact {$nact+1};/nop /if {$nact>40}{/math nact 0}}} {3}
/act {�������} {/if {$que=1} {nextact;/math nact {$nact+1};/nop /if {$nact>40}{/math nact 0}}} {3}
/gag {�������}
/var auto 0
/var nact 0
/al auto {/var auto %0;/var nact 0;/if {%%0=1}{/gag {��Ķ���};/gag {��������æ};/gag {����һ}};/if {%%0=0}{/ungag {��Ķ���};/ungag {��������æ};/ungag {����һ}} }
/act {����һ}  {/if {$auto=1}{/sleep $quedelay;lastact;/math nact {$nact+1};/nop /if {$nact>40}{/math nact 0}}} {3}

/math nQue 0
/math NQue 0
/math que 0
/al Queue {/math que 1;/if {$nQue=$NQue-1}{clearQue;/unal queAct*;/math nQue -1;/math que 0;/ungag {��Ķ���};/ungag {����һ};/ungag {��������æ}};/if {$nQue<$NQue-1} {/al nextact {queAct$nQue;Queue};/al lastact deaddir;deaddir;/math nQue {$nQue+1}} }
/al addQue {/if {$NQue=0}{/gag {��Ķ���};/gag {����һ};/gag {��������æ};/unal queAct*;/math nQue -1};/al queAct$NQue %0;/math NQue {$NQue+1}}
/al clearQue {/math NQue 0}
/al clq clearQue;/al aq addQue;/al que Queue;/al rpt {/math rpt %0};/al rp {clq;/$rpt aq %0;aq showg rpt done!;que};/al q Que
/nop Que -- single que
/al Que {clearQue;addQue %0;Queue}

/var nSeq 0;/var NSeq 0
/al endSeqOld {/bell;showg End of sequence!};/al endSeq endSeqOld
/al seq+ {/al seq$NSeq %0;/math NSeq $NSeq+1}
/al clrSeq {/var NSeq 0;/var nSeq 0;/var doSeq 0}
/var doSeq 0
/al doSeq {/if {$doSeq}{/if {$nSeq>$NSeq-1}{endSeq;clrSeq} else {seq$nSeq;/math nSeq $nSeq+1;upTime {/sleep $sleepSeq;doSeq}}} else {showg Seq interruppted at $nSeq/$NSeq!}}
/al seq {/if {[%%0]}{/var doSeq %%0} else {/var nSeq 0;/var doSeq 1;doSeq}}

/al tick+ {/if {$tickon_%%1}{showg #MYTICK %%1 was already ON.} else {/var tickon_%%1 1;/var ticksize_%%1 %%2;/al tick_%%1 {/if {$tickon_%%%%1}{%%%%1;/sleep $ticksize_%%%%1;tick_%%%%1}};showg #MYTICK %%1 turned on, size=%%2;tick_%%1}}
/al tick- {/var tickon_%1 0}
