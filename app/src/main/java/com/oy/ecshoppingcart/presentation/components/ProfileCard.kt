package com.oy.ecshoppingcart.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AirplaneTicket
import androidx.compose.material.icons.filled.PointOfSale
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oy.ecshoppingcart.presentation.theme.*

@Composable
fun ProfileCard(name:String,point:String,ticket:String) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 15.dp, bottom = 15.dp, start = 25.dp, end = 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally ) {
        CardInfoTable(name,point,ticket)
    }
}

@Composable
fun CardInfoTable(name:String,point:String,ticket:String){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
            .background(
                VeryLightGray
            )
    ) {
        Row(Modifier.padding(16.dp)) {
            CardInfoItem(
                icon = Icons.Default.AccountCircle,
                mainText = name,
                modifier = Modifier.weight(1f)
            )

        }
        Divider(color = LightGray, modifier = Modifier.padding(horizontal = 16.dp))
        Row(
            Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            CardInfoItem(
                icon = Icons.Default.PointOfSale,
                mainText = point,
                modifier = Modifier.weight(1f)
            )
            CardInfoItem(
                icon = Icons.Default.AirplaneTicket,
                mainText = ticket,
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Composable
fun CardInfoItem(icon:ImageVector,mainText:String,modifier: Modifier){
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ){
        Box(
            modifier = Modifier
                .size(34.dp)
                .clip(shape = Shapes.large)
                .background(LightPrimaryColor)
        ){
            Icon(
                modifier = Modifier.padding(top = 4.dp,start = 5.dp),
                imageVector = icon,
                contentDescription = mainText,
            )
        }
        Spacer(modifier = Modifier.width(14.dp))
        Column(
            modifier = Modifier.offset(y = (2).dp)
        ) {
            Text(
                text = mainText,
                fontFamily = Poppins,
                color = SecondaryColor,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

