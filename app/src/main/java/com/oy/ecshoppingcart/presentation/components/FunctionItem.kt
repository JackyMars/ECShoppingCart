package com.oy.ecshoppingcart.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oy.ecshoppingcart.presentation.theme.LightPrimaryColor
import com.oy.ecshoppingcart.presentation.theme.Poppins
import com.oy.ecshoppingcart.presentation.theme.SecondaryColor
import com.oy.ecshoppingcart.presentation.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FunctionItem(
    icon: ImageVector,
    mainText: String,
    onClick: () -> Unit
) {
    Card(
        onClick = { onClick() },
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 0.dp,
    ) {
        Row(
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 14.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
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
    }
}