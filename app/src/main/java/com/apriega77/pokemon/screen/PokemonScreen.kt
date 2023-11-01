package com.apriega77.pokemon.screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.apriega77.pokemon.model.Pokemon

@Composable
fun PokemonScreen(pokemonList: List<Pokemon>) {
    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        val (toolbarRef, itemsRef, buttonRef) = createRefs()

        Box(modifier = Modifier.constrainAs(toolbarRef) {
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
            width = Dimension.fillToConstraints
        }) {
            Text(
                text = "POKEMON", modifier = Modifier
                    .align(Alignment.Center)
                    .padding(16.dp)
            )
        }
        val context = LocalContext.current
        LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.constrainAs(itemsRef) {
            top.linkTo(toolbarRef.bottom)
            start.linkTo(parent.start, 16.dp)
            end.linkTo(parent.end, 16.dp)
            bottom.linkTo(buttonRef.top)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }) {
            items(pokemonList.size) { it ->
                PokemonItemView(pokemon = pokemonList[it]) {
                    Toast.makeText(context.applicationContext, it, Toast.LENGTH_LONG).show()
                }
            }
        }

        Row(modifier = Modifier.constrainAs(buttonRef) {
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
            width = Dimension.fillToConstraints
        }) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(
                    text = "Home", modifier = Modifier
                        .align(Alignment.Center)
                        .padding(16.dp)
                )
            }

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(
                    text = "Type", modifier = Modifier
                        .align(Alignment.Center)
                        .padding(16.dp)
                )
            }
        }

    }
}