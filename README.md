#hi.groovy

This project relies on `spring cli`

Build the archive as 
```
	$> spring jar hi.jar hi.groovy
```

Push to cf
```
	$> cf push -p hi.jar hi-ne
```

Reference
 * https://github.com/joshlong/bootiful-microservices/blob/master/README.md
