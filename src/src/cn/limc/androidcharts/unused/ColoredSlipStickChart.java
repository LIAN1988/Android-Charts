/*
 * ColoredSlipStickChart.java
 * Android-Charts
 *
 * Created by limc on 2014.
 *
 * Copyright 2011 limc.cn All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.limc.androidcharts.unused;

import cn.limc.androidcharts.series.ChartDataTable;
import cn.limc.androidcharts.series.IMeasurable;
import cn.limc.androidcharts.shape.Bar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

/**
 * <p>
 * en
 * </p>
 * <p>
 * jp
 * </p>
 * <p>
 * cn
 * </p>
 * 
 * @author limc
 * @version v1.0 2014/01/20 16:20:40
 * 
 */
public class ColoredSlipStickChart extends SlipStickChart {

	/**
	 * <p>
	 * Constructor of SlipStickChart
	 * </p>
	 * <p>
	 * SlipStickChart类对象的构造函数
	 * </p>
	 * <p>
	 * SlipStickChartのコンストラクター
	 * </p>
	 * 
	 * @param context
	 */
	public ColoredSlipStickChart(Context context) {
		super(context);
	}

	/**
	 * <p>
	 * Constructor of SlipStickChart
	 * </p>
	 * <p>
	 * SlipStickChart类对象的构造函数
	 * </p>
	 * <p>
	 * SlipStickChartのコンストラクター
	 * </p>
	 * 
	 * @param context
	 * @param attrs
	 * @param defStyle
	 */
	public ColoredSlipStickChart(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>
	 * Constructor of SlipStickChart
	 * </p>
	 * <p>
	 * SlipStickChart类对象的构造函数
	 * </p>
	 * <p>
	 * SlipStickChartのコンストラクター
	 * </p>
	 * 
	 * @param context
	 * @param attrs
	 */
	public ColoredSlipStickChart(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
//		super.onDraw(canvas);
	}
   
//   protected void drawSticks(Canvas canvas) {
//       if (null == chartData) {
//           return;
//       }
//       if (chartData.size() == 0) {
//           return;
//       }
//
//       float stickWidth = dataQuadrant.getPaddingWidth() / getDisplayNumber();
//       float stickX = dataQuadrant.getPaddingStartX();
//
//       for(int i=0; i< chartData.size() ; i++){
//           ChartDataTable table = chartData.getChartTable(i);
//           if (null == table) {
//               continue;
//           }
//           if(table.size() == 0){
//               continue;
//           }
//           for (int j = getDisplayFrom(); j < getDisplayTo(); j++) {
//               IMeasurable stick = (IMeasurable)table.get(j);
//               
//               ColorfulBar mole = new ColorfulBar();
//               mole.setUp(this,stick,stickX,stickWidth);
//               mole.draw(canvas);
//
//               // next x
//               stickX = stickX + stickWidth;
//           }
//       }
//   }
}
