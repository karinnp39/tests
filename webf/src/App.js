import React, { useEffect, useState } from 'react';
import { Card, CardContent, CardActions, CssBaseline, Container, Typography, Button, colors } from '@material-ui/core';
import { makeStyles } from '@material-ui/core/styles';
import { BrowserRouter as Router, Switch, Route, Link, useParams } from "react-router-dom";

const useStyle = makeStyles({
  card: {
    width: '100%',
  },
  cardContent: {
    paddingBottom: 5,
  },
  cardActions: {
    padding: 16,
  },
  buttonclick: {
    width: '100%',
    marginBottom: '25px',
  }
})

function App() {
  const [jokes, setJokes] = useState([]);
  const [jokesToShow,setJokesToShow] = useState([]); 
  const classes = useStyle();

  useEffect(() => {
    fetch('https://api.icndb.com/jokes')
      .then(res => res.json())
      .then(res => {
        console.log(res)
        setJokes(res.value)
        setJokesToShow(res.value.slice(0, 10))
      })
      .catch(err => console.log(err));
  }, []);

  const click = (id) => {
    console.log('liking joke', id);
  }

  return (
    <div className="App">
      <CssBaseline />
        <Container>
          <Typography variant="h1" align="center">
            Chuck Norris Jokes
          </Typography>
          {jokes.map((joke) => (
            <Button variant="contained" className={classes.buttonclick} onClick={() => click(joke.id)}>
              <Card key={joke.id} className={classes.card}>
                <CardContent className={classes.cardContent}>
                  <Typography>
                    {joke.joke}
                  </Typography>
                </CardContent>
              </Card>
          </Button>
            ))}
          
        </Container>
    </div>
  );
}

export default App;
