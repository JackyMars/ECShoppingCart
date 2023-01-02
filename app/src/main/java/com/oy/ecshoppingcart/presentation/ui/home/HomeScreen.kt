package com.oy.ecshoppingcart.presentation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.AccountBalanceWallet
import androidx.compose.material.icons.outlined.Note
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.oy.ecshoppingcart.BuildConfig
import com.oy.ecshoppingcart.domain.model.BannerImage
import com.oy.ecshoppingcart.presentation.components.*
import com.oy.ecshoppingcart.presentation.theme.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeScreen :Fragment() {

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                val images = mutableListOf(
                    BannerImage("https://images.unsplash.com/photo-1665354248121-69d2fdb8864f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MHwxfGFsbHwyfHx8fHx8Mnx8MTY2NTM4OTY2NA&ixlib=rb-1.2.1&q=80&w=400"),
                    BannerImage("https://images.unsplash.com/photo-1665384469210-fe98839c174e?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MHwxfGFsbHw4fHx8fHx8Mnx8MTY2NTM4OTY2NA&ixlib=rb-1.2.1&q=80&w=400"),
                    BannerImage("https://images.unsplash.com/photo-1665325306815-fb9cde3d4b92?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MHwxfGFsbHwyfHx8fHx8Mnx8MTY2NTQwNzQzNw&ixlib=rb-1.2.1&q=80&w=400"),
                    BannerImage("https://images.unsplash.com/photo-1665326523639-1b770f5ddae9?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MHwxfGFsbHw1fHx8fHx8Mnx8MTY2NTQwNzQzNw&ixlib=rb-1.2.1&q=80&w=400"),
                    BannerImage("https://images.unsplash.com/photo-1664575601711-67110e027b9b?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MXwxfGFsbHw2fHx8fHx8Mnx8MTY2NTQwNzQzNw&ixlib=rb-1.2.1&q=80&w=400"),
                    BannerImage("https://images.unsplash.com/photo-1665341930997-9b78a214a252?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MHwxfGFsbHw3fHx8fHx8Mnx8MTY2NTQwNzQzNw&ixlib=rb-1.2.1&q=80&w=400"),
                    BannerImage("https://images.unsplash.com/photo-1665142462602-bdf5cc5fd228?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MHwxfGFsbHw4fHx8fHx8Mnx8MTY2NTQwNzQzNw&ixlib=rb-1.2.1&q=80&w=400"),
                    BannerImage("https://images.unsplash.com/photo-1665324031594-382930e876df?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MHwxfGFsbHw5fHx8fHx8Mnx8MTY2NTQwNzQzNw&ixlib=rb-1.2.1&q=80&w=400"),
                    BannerImage("https://images.unsplash.com/photo-1665325306815-fb9cde3d4b92?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MHwxfGFsbHwyfHx8fHx8Mnx8MTY2NTQwNzQzNw&ixlib=rb-1.2.1&q=80&w=400")
                )

                val scaffoldState = rememberScaffoldState()
                val scope = rememberCoroutineScope()

                Scaffold(
                    scaffoldState = scaffoldState,
                    topBar = {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .height(320.dp)) {

                            //home top bar area
                            HomeTopBar(
                                navigationController = findNavController(),
                                scaffoldState = scaffoldState,
                                scope = scope
                            )
                            Spacer(modifier = Modifier.padding(2.dp))

                            //Banner area
                            Surface(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(260.dp)

                            ) {
                                Banner(
                                    images = images,
                                    selectImage =  BannerImage("https://images.unsplash.com/photo-1665354248121-69d2fdb8864f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwzNjcyOTd8MHwxfGFsbHwyfHx8fHx8Mnx8MTY2NTM4OTY2NA&ixlib=rb-1.2.1&q=80&w=400"),
                                    indicatorPadding = 30.dp,
                                    align = Alignment.BottomCenter
                                )


                            }
                        }

                    },
                    drawerContent = {
                        // Drawer content
                        //user name and point area
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .padding(top = 40.dp, start = 8.dp,end = 8.dp, bottom = 8.dp),
                            shape = Shapes.large,
                            elevation = 0.dp,
                            backgroundColor = Color.White
                        ) {
                            ProfileCard(
                                name = "Mars",
                                point = "30",
                                ticket = "1"
                            )
                        }

                        // function area
                        val functions:List<Pair<String, ImageVector>> = listOf(
                            "訂單紀錄" to Icons.Outlined.Note,
                            "點數紀錄" to Icons.Default.Article,
                            "點數兌換" to  Icons.Default.StayCurrentPortrait,
                            "票卷匣" to  Icons.Outlined.AccountBalanceWallet,
                            "設定" to  Icons.Outlined.Settings
                        )
                        Spacer(modifier = Modifier.padding(20.dp))

                        LazyColumn{
                            itemsIndexed(functions) { index,function->
                                FunctionItem(
                                    icon = function.second,
                                    mainText = function.first,
                                    onClick = {}
                                )
                            }
                        }

            
                        // version name area
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(bottom = 15.dp),
                            verticalArrangement = Arrangement.Bottom,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "版本號:" + BuildConfig.VERSION_NAME,
                                fontFamily = Poppins,
                                color = LightPrimaryColor,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                    },
                    drawerBackgroundColor = Color.LightGray,
                    drawerContentColor = Color.White,
                    drawerShape = RoundedCornerShape(topEnd = 50.dp, bottomEnd = 50.dp)
                ){

//                    Spacer(modifier = Modifier.padding(8.dp))
//                    VerticalPagerWithTabs(
//                        isSelected = isSelected,
//                        tabs = categories,
//                        onSelected = {viewModel.onSelected(isSelected)}
//                    )
                }
            }
        }
    }



}