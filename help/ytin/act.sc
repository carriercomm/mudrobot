/nop high {brown} {[%0]}
/al {kfAct} {/al kfact %0;/act {�꾩����}{kfact;/al kfact kfact0}}
/al kfact0 /nop

/var {overcmds} {0}
/var {timeOvercmds} {15}
/al {overcmds} {/nop}
/act {��һ������} {Overcmds}
/al Overcmds {/if {$overcmds=0}{/var overcmds 1;/purge;/tickoff;/sleep $timeOvercmds;;/var overcmds 0;upTime {overcmds;/tickon}}}
/var noExpPr 0
/al noExpPr /nop
/act {��ĵ��л�����} {/if {$noExpPr=0}{/var noExpPr 1;noExpPr;/sleep 5;/var noExpPr 0}}

/act {����˸�����} {poisonact};/al poisonact /bell
/act {$_HIG$��о�����һ���} {poisonact}

/act {$frdһҧ��������Ѫ} {nxAct};/al nxAct /bell
/act {$frd��Ѫ������һ�������} {nxdone};/al nxdone /bell
/act {$frd����Ѫ����������ת��Ȼ������ע�������} {nxAct2};/al nxAct2 /bell
/act {$frd��С���๦����������} {wxAct} {6};/al wxAct /nop
/act {���С���๦����������} {mywxact};/al mywxact {/var inext jldl}
/act {���С���๦����} {mywxdone};/al mywxdone /nop
/act {�㱻���˸����ֲ���������} {3axeAct};/al 3axeAct /bell
/act {��΢һ������������}{/var clockhuti $_clock;/var inext powerup;mytonact};/al mytonact /nop
/act {��ķ���������������һ��} {/var inext 0;mytondone};/al mytondone /nop
/act {��ѻ�������������} {myzxact};/al myzxact {/var inext zhuxie}
/act {��Ļ�����������һ��} {myzxdone;/var inext 0};/al myzxdone /nop
/act {���Բ���ķ�������} {myhfact};/al myhfact {/var inext huifeng}
/act {���Բ���ķ�����һ��} {myhfdone;/var inext 0};/al myhfdone /nop
/var inext 0
/act {�����̨�ķ�} {/var clockhuti $_clock;/var inext huti;mylotact};/al mylotact /nop
/act {�����̨�ķ�����} {/var inext 0;mylotdone};/al mylotdone /nop
/act {΢һ�������������ķ�} {/var clockshield $_clock;/var inext shield;myshldact};/al myshldact /nop
/act {��������ķ�����} {/var inext 0;myshlddone};/al myshlddone /nop
/act {����ڹ��ķ�������Ĭ��} {/var dhwl 1}
/act {��һ������������} {/var dhwl 2;/sleep 8;/var dhwl 0;/if {!$que} {ef 0;perform dhwl}}
/act {���þ�ȫ����һ������}{/var ssj 1;/sleep 5;/var ssj 0}
/act {���%0������} {/var ssj 1;/sleep 7;/var ssj 0}
/act {���ָ����} {myyiyang};/al myyiyang /nop
/act {��˫�ֻ�һ��Բ} {my3};/al my3 /nop
/act {�������һ���} {time2esc};/al time2esc /nop

/act {���������һ��} {failfly};/al {failfly} {/nop}
/act {������ͷ�Բ�̫} {failfly}
/act {���������} {2ht2fly};/al 2ht2fly failfly
/math nocloud 0
/act {��Χû��һƬ��} {/if {$nocloud=0}{nocloud};/math nocloud 1;/sleep 0.4;/math nocloud 0};/al {nocloud} {/nop}
/act {�Ѿ����ȵ�} {/if {$dk<$Dk-30} {/var water 0;fillact}};/al fillact /nop
/act {���ﲻ׼������} {nocast};/al {nocast} {/nop}

/act {�������һ�ַ���} {ecc}
/act {�����ڵ���} {noqi};/al {noqi} {wakeact}
/act {�����ھ���̫��} {nosh};/al {nosh} {wakeact}
/act {���й����} {finishcf2};/al {finishcf2} {/nop }
/act {��ڤ�����} {finishcf3};/al {finishcf3} {/nop}
/act {����ķ���} {overcf3};/al overcf3 /nop
/act {�������Ϣ} {overcf2};/al overcf2 /nop
/act {�㻺������} {finishxd};/al {finishxd} {/nop}
/act {���������} {/if {$tickon_quitact} {/nop} else {/if {$killing}{/nop} else {finishqjn}}};/al finishqjn /nop

/act {��Ҫ��ʲô} {lWhat};/al lWhat /nop
/act {���Ǯ����} {nomoney};/al nomoney /nop
/act {��Ҫ��˭��} {bFromWhom};/al bFromWhom /nop
/act {�������̫����} {2heavy4u};/al 2heavy4u /nop
/act {����̫����} {2heavy} {6};/al 2heavy /nop
/act {��Ŀǰ��%0�ļ���} {urskill};/al urskill /nop
/act {����û�������} {noppl};/al noppl /nop
/act {���빥��˭} {attWhom};/al attWhom /nop
/act {��Ҫ��˭���} {lnWhom};/al lnWhom /nop
/act {��Ҫ��ʲô} {stWhat};/al {stWhat} {/var fighting 0}
/act {���޷���ս����} {fighting};/al {fighting} {/var fighting 1}
