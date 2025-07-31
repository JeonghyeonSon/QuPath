setImageType('BRIGHTFIELD_H_E')
setColorDeconvolutionStains('{"Name" : "H&E default", "Stain 1" : "Hematoxylin", "Values 1" : "0.6511078257574492 0.7011930431234068 0.29049426072255424", "Stain 2" : "Eosin", "Values 2" : "0.2158989356208711 0.8011960501132094 0.5580972485873468", "Background" : " 255 255 255"}')
createSelectAllObject(true)
selectAnnotations()
runPlugin('qupath.imagej.detect.cells.PositiveCellDetection', '{"detectionImageBrightfield":"Hematoxylin OD","backgroundByReconstruction":true,"backgroundRadius":15.0,"medianRadius":0.0,"sigma":2.0,"minArea":10.0,"maxArea":1000.0,"threshold":0.005,"maxBackground":2.0,"watershedPostProcess":true,"cellExpansion":5.0,"includeNuclei":true,"smoothBoundaries":true,"makeMeasurements":true,"thresholdCompartment":"Nucleus: Eosin OD mean","thresholdPositive1":0.2,"thresholdPositive2":0.4,"thresholdPositive3":0.6000000000000001,"singleThreshold":true}')


