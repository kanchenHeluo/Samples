package com.bupt.syc.poetry;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class HelpActivity extends MyActivity{
    TextView t = null;
//    String s = "������ܣ�\n"+
//    		"����˵�����������Կ��������ĸ�ѡ�\n" +
//    		"�������棺\n   �����ѡ�������ѡ����Ҫѧϰ��ʫ�ʷ�Χ���������������ߵȣ�," +
//    		"���ȷ������ʫ��ѧϰ���档������¼�˽�500�״�Ҷ��������ʫ�ʣ������������֣������Ծ����ѧϰӴ~ " +
//    		"�������Զ��Լ���ѧ����ʫ�ʴ����Ѷ���־���Ա��ڶ��Ѷ�ʫ�ʽ������Ҳ��ԡ�\n" +
//    		"С��ţ����\n   �����ѡ�������ѡ����Ҫ���Ե�ʫ�ʷ�Χ���������������ߡ����������ȣ���" +
//    		"���ȷ��������Խ��档���Խ��水���������������100�֡������ʾ����ִ��ҵ���ʾ���֣����ɸ�����������ѡ���Ƿ���Ҫ��ʾ��" +
//    		"����һ���������½ǵ���һ���л���Ŀ���档��������ύ��ϵͳ�����������εĵ÷ֺͱ����𰸡�\n" +
//    		"�߲���ʫ��\n    ����һ����д��ȱʫ�����Ϸ�������ѡ�����ֱ�ӽ��뵽һ��������档��һ�׶δ���һ����10���⣬���Ƕ�ÿ�������20s�Ĵ���ʱ�䣻" +
//    		"ÿ����һ���׶������Ե���ύ����ô����ʣ���ʱ����ۻ�����һ�׶Σ���һ���׶ε���������������һ�׶δ�Ե�������" +
//    		"����ʵ���޷������������Ŀ�Ĵ𰸣�������ʹ��ը����������Ŀ�оͻ�ֻʣ����Ҫ��ʫ���е��֣�����ը��ֻ��������Ҫ��ϧŶ����Ȼ��ÿ�����10����Ŀ��������һ��ը����"+
//    		"ͬʱ�ۻ�ʱ�������һ�׶ε�ÿ�����ʱ�䡣�����޷��ٴ��һ�������ʱ�����Ƶ��ڣ�����������ս�����ϵͳ��������������ս�ĳɼ���������ѡ���Ƿ񱣴����ļ�¼�����а�ͬʱ��������΢����ҫһ�������ۺ񹦵ף�\n" +
//    		"ʫ�����٣�\n   �����ѡ����ῴ��һ��12*12�ķ����������Ϥ�Ϸ���ĩ��Сǿ���ֵĻ�����ô���Ը÷���һ����İ������������еİ�ɫ����" +
//    		"���Կ�����Ӧ�ð�ɫ����ĺ�/��������Ҫ�����������ʾ���ٵ����д�ɶԸú�/���н�����д����Ҫע����ǣ�����������洦�İ�ɫ�����ٵ����д��" +
//    		"���ڲ�ȷ��������д���Ǻỹ�����У����ǽ���������д������������ǽ��洦��ɫ�����Խ���Ψһ��дӴ��\n" +
//    		"\n" +
//    		"   ������Ǹ����ĺ�����ѧ�����ĸ�ĸ����Ӧ�ÿ��԰�����Ϊ���ĺ���ѡ��ѧϰ�Ͳ��Է�Χ��������Ǹ��Ȱ���ѧ������С���꣬��Ϸһ�Ͷ�����Ϊ���ṩ��ս����ʫ�ʻ��۹�ȣ����ڵ�ʲô������������ָ�������� ~~ ";
    String s = "������ܣ�\n" + 
    		"�������棺\n" +
    		"1�������ѡ���������������ѡ����档������ѡ����Ҫѧϰ��ʫ�ʷ�Χ���������������ߡ���õȣ������Լ���Ҫѧϰ��ʫ������Χɸѡ��\n" +
    		"2������ʾ������ѡ������Ҫѧϰ��ʫ�裬����ѧϰ���档������¼�˽�500�׶��������ʫ�ʣ����������������Ծ���ѧϰ~~~\n" +
    		"3����ʫ��ѧϰ�����У�������ѡ�����ӵ���ѧ����ť�������´�����ѧϰ�����ڲ����У��Ϳ��Ը�ϰ���Ѿ�ѧ����ʫ���ˣ�\n" +
    		"ע�⣺������ѡ����Զ������ȡ���ٴε����ť���ɡ�\n\n" +

    		"С��ţ����\n" +
    		"1�������ѡ���������������ѡ����档������ѡ����Ҫѧϰ��ʫ�ʷ�Χ���������������ߡ���õȣ��Լ��Ƿ�����ѧ��Χ�����������Լ���Ҫ���Ե�ʫ�跶Χ��\n" +
    		"2�������ʼ���Խ�����Խ��档����100�֡��ڼ�������ѡ�����д��⣬����ѡ����ʾ�����ǻ����ϵ�����Թ�ѡ�񣬵���ּ���ѡ�ϡ�\n" +
    		"3��������һ�⣬�����һ��������������������ύ�����ǽ��������ĵ÷ֺ���ȷ�𰸡���ɫ������������⣬��ɫ������δ����⣬��ɫ��������Ե��⣡\n\n" +

    		"�߲���ʫ��\n" +
    		"1�������ѡ�����ֱ�ӽ��뵽һ�����е���ʱ�Ĵ�����棬�����Ϸ�Ĵ��Ǹ�������Ե������ֽ׶ν���ʽ���еġ������ڵ�һ�׶δ�Ե��������ύ�����ǽ�׷��һ���׶Σ�����׶ε�������������Ե�������ֱ�����޷������Ϊֹ��\n" +
    		"2����һ�׶δ���һ����10���⣬ÿ�����������ʱ�䰴�ղ�ͬ�׶���������������ʱ��ʣ��ʱ���ǽ׶��ۻ��ģ�����������ǰ�����׶�ʣ���ʱ�佫һֱ�ۻ�������ĳ���׶�����ʱ��ľ�����ô��ǿ�г����ύ������\n" +
    		"3����ÿ����������У����Ƿ�����ը���Խ��ʹ����Ѷȡ�ը�����������ۻ����10���ⲹ��һ��������Ϊ3��\n" +
    		"4�������մ�����������ǽ��������ķ�����������/δ�����Ŀ�Ĵ𰸡��ڴ𰸽�����ѡ�񷵻أ�����ᵯ���Ƿ��¼���а�Ĵ��ڣ������������Լ������֣��������а񻹿��Բ鿴���˵ļ�¼��\n\n" +


    		"�ݺ�ʫ����\n" +
    		"1�������ѡ����ῴ��һ��12*12�ķ����������Ϥ�Ϸ���ĩ��Сǿ���ֵĻ�����ô���Ը÷���һ����İ����\n" +
    		"2����������еİ�ɫ���񣬿��Կ�����Ӧ�ð�ɫ����ĺ�/��������Ҫ�����������ʾ���ٵ����д�ɶԸú�/���н�����д��\n" +

    		"ע�⣺\n" +
    		"1������������洦�İ�ɫ�����ٵ����д�����ڲ�ȷ��������д���Ǻỹ�����У����ǽ���������д������������ǽ��洦��ɫ�����Խ���Ψһ��дӴ��\n" +
    		"2������ʾ����ʾ��ʾ��ȫ���������ʾ���֣����ֻ�������ʽ���������Ϳ��Կ���������ʾ����\n\n" +
    		
    		"�˵��������Ե��ϵͳ�Ĳ˵�����Ȼ��ᵯ������Ϸ�Ĳ˵����ڲ˵��У������Դ�/�رձ������֡�\n\n"+
    		"   ������Ǹ����ĺ�����ѧ�����ĸ�ĸ����Ӧ�ÿ��԰�����Ϊ���ĺ���ѡ��ѧϰ�Ͳ��Է�Χ��������Ǹ��Ȱ���ѧ������С���꣬��Ϸһ�Ͷ�����Ϊ���ṩ��ս����ʫ�ʻ��۹�ȣ����ڵ�ʲô������������ָ�������� ~~ ";
    	    ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.helpview);	
		changeActivity = false;
		//Music.play(this);
		t = (TextView)findViewById(R.id.helptxt);
		t.setText(s);
		t.setTextColor(Color.BLACK);
		t.setMovementMethod(ScrollingMovementMethod.getInstance());
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		//Music.stop(this);
		finish();
	}
	
	
//	protected void onStop() {
//		// TODO Auto-generated method stub
//		super.onStop();
//		Music.stop(this);
//	}
}