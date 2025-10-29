package CC.Util.By;

import CC.Util.By.Get.*;
import CC.Util.By.Grup.Get_Prim_By_Prim;
import CC.Util.By.Pref.Pref_Set_Q_By_Q;
import CC.$.Q$Q_LMNt.Q$Q.Q$Q_Intrfac;
import CC.$.Tran;
import CC.Util.Valu_Havr_Q;

public interface Get_Q_By_Q extends
	Valu_Havr_Q,
	Tran<Get_Prim_By_Prim,Pref_Set_Q_By_Q>
{
	Q$Q_Intrfac<Get_Prim_By_Prim,
		Get_Bool_By_Bool,Get_ChR_By_Bool,Get_Flot_By_Bool,Get_Dubl_By_Bool,Get_Byt_By_Bool,Get_Short_By_Bool,Get_Int_By_Bool,Get_Long_By_Bool,Get_Point_By_Bool,
		Get_Bool_By_ChR,Get_ChR_By_ChR,Get_Flot_By_ChR,Get_Dubl_By_ChR,Get_Byt_By_ChR,Get_Short_By_ChR,Get_Int_By_ChR,Get_Long_By_ChR,Get_Point_By_ChR,
		Get_Bool_By_Flot,Get_ChR_By_Flot,Get_Flot_By_Flot,Get_Dubl_By_Flot,Get_Byt_By_Flot,Get_Short_By_Flot,Get_Int_By_Flot,Get_Long_By_Flot,Get_Point_By_Flot,
		Get_Bool_By_Dubl,Get_ChR_By_Dubl,Get_Flot_By_Dubl,Get_Dubl_By_Dubl,Get_Byt_By_Dubl,Get_Short_By_Dubl,Get_Int_By_Dubl,Get_Long_By_Dubl,Get_Point_By_Dubl,
		Get_Bool_By_Byt,Get_ChR_By_Byt,Get_Flot_By_Byt,Get_Dubl_By_Byt,Get_Byt_By_Byt,Get_Short_By_Byt,Get_Int_By_Byt,Get_Long_By_Byt,Get_Point_By_Byt,
		Get_Bool_By_Short,Get_ChR_By_Short,Get_Flot_By_Short,Get_Dubl_By_Short,Get_Byt_By_Short,Get_Short_By_Short,Get_Int_By_Short,Get_Long_By_Short,Get_Point_By_Short,
		Get_Bool_By_Int,Get_ChR_By_Int,Get_Flot_By_Int,Get_Dubl_By_Int,Get_Byt_By_Int,Get_Short_By_Int,Get_Int_By_Int,Get_Long_By_Int,Get_Point_By_Int,
		Get_Bool_By_Long,Get_ChR_By_Long,Get_Flot_By_Long,Get_Dubl_By_Long,Get_Byt_By_Long,Get_Short_By_Long,Get_Int_By_Long,Get_Long_By_Long,Get_Point_By_Long,
		Get_Bool_By_Point,Get_ChR_By_Point,Get_Flot_By_Point,Get_Dubl_By_Point,Get_Byt_By_Point,Get_Short_By_Point,Get_Int_By_Point,Get_Long_By_Point,Get_Point_By_Point
	> P=new Q$Q_Intrfac<>()
	{
		@Override public boolean Bool$Bool(Get_Bool_By_Bool W,boolean In){return false;}
		@Override public char Bool$ChR(Get_ChR_By_Bool W,boolean In){return 0;}
		@Override public float Bool$Flot(Get_Flot_By_Bool W,boolean In){return 0;}
		@Override public double Bool$Dubl(Get_Dubl_By_Bool W,boolean In){return 0;}
		@Override public byte Bool$Byt(Get_Byt_By_Bool W,boolean In){return 0;}
		@Override public short Bool$Short(Get_Short_By_Bool W,boolean In){return 0;}
		@Override public int Bool$Int(Get_Int_By_Bool W,boolean In){return 0;}
		@Override public long Bool$Long(Get_Long_By_Bool W,boolean In){return 0;}
		@Override public Object Bool$Point(Get_Point_By_Bool W,boolean In){return null;}
		@Override public boolean ChR$Bool(Get_Bool_By_ChR W,char In){return false;}
		@Override public char ChR$ChR(Get_ChR_By_ChR W,char In){return 0;}
		@Override public float ChR$Flot(Get_Flot_By_ChR W,char In){return 0;}
		@Override public double ChR$Dubl(Get_Dubl_By_ChR W,char In){return 0;}
		@Override public byte ChR$Byt(Get_Byt_By_ChR W,char In){return 0;}
		@Override public short ChR$Short(Get_Short_By_ChR W,char In){return 0;}
		@Override public int ChR$Int(Get_Int_By_ChR W,char In){return 0;}
		@Override public long ChR$Long(Get_Long_By_ChR W,char In){return 0;}
		@Override public Object ChR$Point(Get_Point_By_ChR W,char In){return null;}
		@Override public boolean Flot$Bool(Get_Bool_By_Flot W,float In){return false;}
		@Override public char Flot$ChR(Get_ChR_By_Flot W,float In){return 0;}
		@Override public float Flot$Flot(Get_Flot_By_Flot W,float In){return 0;}
		@Override public double Flot$Dubl(Get_Dubl_By_Flot W,float In){return 0;}
		@Override public byte Flot$Byt(Get_Byt_By_Flot W,float In){return 0;}
		@Override public short Flot$Short(Get_Short_By_Flot W,float In){return 0;}
		@Override public int Flot$Int(Get_Int_By_Flot W,float In){return 0;}
		@Override public long Flot$Long(Get_Long_By_Flot W,float In){return 0;}
		@Override public Object Flot$Point(Get_Point_By_Flot W,float In){return null;}
		@Override public boolean Dubl$Bool(Get_Bool_By_Dubl W,double In){return false;}
		@Override public char Dubl$ChR(Get_ChR_By_Dubl W,double In){return 0;}
		@Override public float Dubl$Flot(Get_Flot_By_Dubl W,double In){return 0;}
		@Override public double Dubl$Dubl(Get_Dubl_By_Dubl W,double In){return 0;}
		@Override public byte Dubl$Byt(Get_Byt_By_Dubl W,double In){return 0;}
		@Override public short Dubl$Short(Get_Short_By_Dubl W,double In){return 0;}
		@Override public int Dubl$Int(Get_Int_By_Dubl W,double In){return 0;}
		@Override public long Dubl$Long(Get_Long_By_Dubl W,double In){return 0;}
		@Override public Object Dubl$Point(Get_Point_By_Dubl W,double In){return null;}
		@Override public boolean Byt$Bool(Get_Bool_By_Byt W,byte In){return false;}
		@Override public char Byt$ChR(Get_ChR_By_Byt W,byte In){return 0;}
		@Override public float Byt$Flot(Get_Flot_By_Byt W,byte In){return 0;}
		@Override public double Byt$Dubl(Get_Dubl_By_Byt W,byte In){return 0;}
		@Override public byte Byt$Byt(Get_Byt_By_Byt W,byte In){return 0;}
		@Override public short Byt$Short(Get_Short_By_Byt W,byte In){return 0;}
		@Override public int Byt$Int(Get_Int_By_Byt W,byte In){return 0;}
		@Override public long Byt$Long(Get_Long_By_Byt W,byte In){return 0;}
		@Override public Object Byt$Point(Get_Point_By_Byt W,byte In){return null;}
		@Override public boolean Short$Bool(Get_Bool_By_Short W,short In){return false;}
		@Override public char Short$ChR(Get_ChR_By_Short W,short In){return 0;}
		@Override public float Short$Flot(Get_Flot_By_Short W,short In){return 0;}
		@Override public byte Short$Dubl(Get_Dubl_By_Short W,short In){return 0;}
		@Override public short Short$Byt(Get_Byt_By_Short W,short In){return 0;}
		@Override public short Short$Short(Get_Short_By_Short W,short In){return 0;}
		@Override public int Short$Int(Get_Int_By_Short W,short In){return 0;}
		@Override public long Short$Long(Get_Long_By_Short W,short In){return 0;}
		@Override public Object Short$Point(Get_Point_By_Short W,short In){return null;}
		@Override public boolean Int$Bool(Get_Bool_By_Int W,int In){return false;}
		@Override public char Int$ChR(Get_ChR_By_Int W,int In){return 0;}
		@Override public float Int$Flot(Get_Flot_By_Int W,int In){return 0;}
		@Override public double Int$Dubl(Get_Dubl_By_Int W,int In){return 0;}
		@Override public byte Int$Byt(Get_Byt_By_Int W,int In){return 0;}
		@Override public short Int$Short(Get_Short_By_Int W,int In){return 0;}
		@Override public int Int$Int(Get_Int_By_Int W,int In){return 0;}
		@Override public long Int$Long(Get_Long_By_Int W,int In){return 0;}
		@Override public Object Int$Point(Get_Point_By_Int W,int In){return null;}
		@Override public boolean Long$Bool(Get_Bool_By_Long W,long In){return false;}
		@Override public char Long$ChR(Get_ChR_By_Long W,long In){return 0;}
		@Override public float Long$Flot(Get_Flot_By_Long W,long In){return 0;}
		@Override public double Long$Dubl(Get_Dubl_By_Long W,long In){return 0;}
		@Override public byte Long$Byt(Get_Byt_By_Long W,long In){return 0;}
		@Override public short Long$Short(Get_Short_By_Long W,long In){return 0;}
		@Override public int Long$Int(Get_Int_By_Long W,long In){return 0;}
		@Override public long Long$Long(Get_Long_By_Long W,long In){return 0;}
		@Override public Object Long$Point(Get_Point_By_Long W,long In){return null;}
		@Override public boolean Point$Bool(Get_Bool_By_Point W,Object In){return false;}
		@Override public char Point$ChR(Get_ChR_By_Point W,Object In){return 0;}
		@Override public float Point$Flot(Get_Flot_By_Point W,Object In){return 0;}
		@Override public double Point$Dubl(Get_Dubl_By_Point W,Object In){return 0;}
		@Override public byte Point$Byt(Get_Byt_By_Point W,Object In){return 0;}
		@Override public short Point$Short(Get_Short_By_Point W,Object In){return 0;}
		@Override public int Point$Int(Get_Int_By_Point W,Object In){return 0;}
		@Override public long Point$Long(Get_Long_By_Point W,Object In){return 0;}
		@Override public Object Point$Point(Get_Point_By_Point W,Object In){return null;}
	};
}